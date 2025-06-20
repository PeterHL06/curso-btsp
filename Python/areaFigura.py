# Calculo del área

fig = input("¿Qué figura quieres calcular (triangulo o cuadrado)?\n")


while( fig != "triangulo" and fig != "cuadrado"):
    print("La figura no es correcta")
    fig = input("Ingrese de nuevo la figura (triangulo o cuadrado): ")

bas = float(input("¿Cuanto mide de la base?\n"))
alt = float(input("¿Cuanto mide de la altura?\n"))

if( fig == "triangulo"):
    a = (bas*alt)/2
    print("El área del ", fig), print(" es de: ", a)

else:
    a = (bas * alt)
    print("El área del ", fig), print(" es de: ", a)