#
#_, letra mayuscula o minuscula
# no debe existir espacios, pero si podemos
# separarlas _

#variables validas
#_nombre_123
#_clave
#_usuario
#edadUsuario
#deporte

# Enteros int 1,2,3,4,5,6,...
# Flotantes float 1.5, 1.6, 2.444
# Booleanos boolean true, false
# caracteres char 'c', 'a', 'b'
# cadena str "Enrique", "abecedario"

#Tipo de datos

a = 10
print(type(a))
print(a)
a = '10'
print(type(a))
print(a)

entero = 10
flotante = 3.14156
cadena = "Esto es una cadena"
boolean = True
null = None
nombre = "Pedro"

#impresión de pantalla
print("Bienvenido al curso")
print(nombre)
print(entero)

#solicitar información al usuario
nombre = input("Dime tu nombre: ")
print(nombre)
edad = int(input("Cuantos años tienes: "))
print(edad,type(edad))
