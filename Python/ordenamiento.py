# Solicitar al usuario el número de personas.

nombre_clientes = []
tiempos = []

n_clientes = int(input("Indica cuántas personas ingresarán: "))

for i in range(n_clientes):
    nom_c = input("Ingresa tu nombre: ")
    tiem_c = int(input("¿Cuántos minutos tardaría en su cita (máx. 120min)?: "))
    nombre_clientes.append(nom_c)
    tiempos.append(tiem_c)

total_clientes = len(tiempos)
# print(total_clientes)
# print(nombre_clientes)
# print(tiempos)


for i in range(total_clientes): #i: 0 - 7
    # print("\n")
    for j in range(total_clientes): #j: 0 - 7
        # print("💩 "+str(tiempos))
        if (tiempos[i] < tiempos[j]):
            # print("✨ i: " + str(i) + ", j: " + str(j))
            # print(tiempos)
            aux_t = tiempos[i]
            tiempos[i] = tiempos [j]
            tiempos[j] = aux_t
            aux_n = nombre_clientes[i]
            nombre_clientes[i] = nombre_clientes [j]
            nombre_clientes[j] = aux_n
        
print("\n")            
for i in range(total_clientes):
    print("Lugar No."+str(i+1))
    print("Nombre: " + nombre_clientes[i])
    print("Duración en min: " + str(tiempos[i]) + str("\n"))