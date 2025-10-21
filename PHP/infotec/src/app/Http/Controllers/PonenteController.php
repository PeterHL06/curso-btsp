<?php

namespace App\Http\Controllers;

use App\Models\Ponente;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Validator;

class PonenteController extends Controller
{
    /**
     * Muestra una lista de todos los ponentes.
     */
    public function index()
    {
        $ponentes = Ponente::all();


         $respuesta = [
            'ponentes' => $ponentes,
            'status' => 200,
        ];

        return response()->json($respuesta);
    }

    /**
     * Almacena un ponente recién creado.
     */
    public function store(Request $request)
    {
        $validator = Validator::make($request->all(), [
            'nombre' => 'required',
            'biografia' => 'required',
            'especialidad' => 'required',
        ]);

        if ($validator->fails()) {
            $respuesta = [
                'message' => 'Datos faltantes',
                'status' => 400, // Petición inválida
            ];
            return response()->json($respuesta, 400);
        }


    
        $ponente = Ponente::create([
            'nombre' => $request->nombre,
            'biografia' => $request->biografia,
            'especialidad' => $request->especialidad,
            
        ]);

        if (!$ponente) {
            $respuesta = [
                'message' => 'Error al crear el ponente',
                'status' => 500, // Error interno del servidor
            ];
            return response()->json($respuesta, 500);
        }

         $respuesta = [
            'ponente' => $ponente,
            'status' => 201, // Creado
        ];
        return response()->json($respuesta, 201);
    }

    /**
     * Muestra un ponente específico.
     */
    public function show($id)
    {
        $ponente = Ponente::find($id);

        if (!$ponente) {
            $respuesta = [
                'message' => 'Ponente no encontrado',
                'status' => 404, // No encontrado
            ];
            return response()->json($respuesta, 404);
        }
        $respuesta = [
            'ponente' => $ponente,
            'status' => 200, // OK
        ];

        return response()->json($respuesta);
       
    }

    /**
     * Actualiza un ponente específico.
     */
    public function update(Request $request, $id)
    {
        $ponente = Ponente::find($id);

        if (!$ponente) {
            $respuesta = [
                'message' => 'Ponente no encontrado',
                'status' => 404, // No encontrado
            ];
            return response()->json($respuesta, 404);
        }

      
        $validator = Validator::make($request->all(), [
            'nombre' => 'required',
            'biografia' => 'required',
            'especialidad' => 'required',
            
        ]);

        if ($validator->fails()) {
            $respuesta = [
                'message' => 'Datos faltantes',
                'status' => 400, // Petición inválida
            ];
            return response()->json($respuesta, 400);
        }

        // Se eliminó la asignación de 'apellido'.
        $ponente->nombre = $request->nombre;
        $ponente->especialidad = $request->especialidad;
        $ponente->biografia = $request->biografia;
        $ponente->save();

        // Retornar el recurso actualizado
        $respuesta = [
            'ponente' => $ponente,
            'status' => 200, // OK
        ];

        return response()->json($respuesta);
    }

    /**
     * Elimina un ponente específico.
     */
    public function destroy($id)
    {
        $ponente = Ponente::find($id);

        if (!$ponente) {
            $respuesta = [
                'message' => 'Ponente no encontrado',
                'status' => 404, // No encontrado
            ];
            return response()->json($respuesta, 404);
        }

        $ponente->delete();

        $respuesta = [
            'message' => 'Ponente eliminado',
            'status' => 200, // OK
        ];

        return response()->json($respuesta);
    }
}
