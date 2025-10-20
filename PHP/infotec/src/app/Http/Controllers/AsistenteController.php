<?php

namespace App\Http\Controllers;

// 1. Cambiar el modelo a Asistente
use App\Models\Asistente;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Validator;

class AsistenteController extends Controller
{
    /**
     * Muestra una lista de todos los asistentes.
     */
    public function index()
    {
        // 2. Cambiar las variables a plural: $asistentes
        $asistentes = Asistente::all();

        // 3. Actualizar la clave en la respuesta JSON
        $respuesta = [
            'asistentes' => $asistentes,
            'status' => 200,
        ];

        return response()->json($respuesta);
    }

    /**
     * Almacena un asistente recién creado.
     */
    public function store(Request $request)
    {
        // 4. Adaptar las reglas de validación para el asistente
        $validator = Validator::make($request->all(), [
            'nombre' => 'required',
            'email' => 'required|email',
            'telefono' => 'required',
            // Valida que el evento_id exista en la tabla 'eventos'
            'evento_id' => 'required|integer|exists:eventos,id',
        ]);

        if ($validator->fails()) {
            $respuesta = [
                'message' => 'Error de validación',
                'errors' => $validator->errors(),
                'status' => 400, // Petición inválida
            ];
            return response()->json($respuesta, 400);
        }

        // Crear el nuevo asistente con los datos de la petición
        $asistente = Asistente::create([
            'nombre' => $request->nombre,
            'email' => $request->email,
            'telefono' => $request->telefono,
            'evento_id' => $request->evento_id,
        ]);

        if (!$asistente) {
            $respuesta = [
                'message' => 'Error al crear el asistente',
                'status' => 500, // Error interno del servidor
            ];
            return response()->json($respuesta, 500);
        }

        $respuesta = [
            'asistente' => $asistente,
            'status' => 201, // Creado
        ];
        return response()->json($respuesta, 201);
    }

    /**
     * Muestra un asistente específico.
     */
    public function show($id)
    {
        $asistente = Asistente::find($id);

        if (!$asistente) {
            $respuesta = [
                'message' => 'Asistente no encontrado',
                'status' => 404, // No encontrado
            ];
            return response()->json($respuesta, 404);
        }
        $respuesta = [
            'asistente' => $asistente,
            'status' => 200, // OK
        ];

        return response()->json($respuesta);
    }

    /**
     * Actualiza un asistente específico.
     */
    public function update(Request $request, $id)
    {
        $asistente = Asistente::find($id);

        if (!$asistente) {
            $respuesta = [
                'message' => 'Asistente no encontrado',
                'status' => 404, // No encontrado
            ];
            return response()->json($respuesta, 404);
        }

        // Adaptar reglas de validación para la actualización
        $validator = Validator::make($request->all(), [
            'nombre' => 'required',
            'email' => 'required|email',
            'telefono' => 'required',
            'evento_id' => 'required|integer|exists:eventos,id',
        ]);

        if ($validator->fails()) {
            $respuesta = [
                'message' => 'Error de validación',
                'errors' => $validator->errors(),
                'status' => 400, // Petición inválida
            ];
            return response()->json($respuesta, 400);
        }

        // Actualizar los datos del asistente
        $asistente->nombre = $request->nombre;
        $asistente->email = $request->email;
        $asistente->telefono = $request->telefono;
        $asistente->evento_id = $request->evento_id;
        $asistente->save();

        // Retornar el recurso actualizado
        $respuesta = [
            'asistente' => $asistente,
            'status' => 200, // OK
        ];

        return response()->json($respuesta);
    }

    /**
     * Elimina un asistente específico.
     */
    public function destroy($id)
    {
        $asistente = Asistente::find($id);

        if (!$asistente) {
            $respuesta = [
                'message' => 'Asistente no encontrado',
                'status' => 404, // No encontrado
            ];
            return response()->json($respuesta, 404);
        }

        $asistente->delete();

        $respuesta = [
            'message' => 'Asistente eliminado exitosamente',
            'status' => 200, // OK
        ];

        return response()->json($respuesta);
    }
}