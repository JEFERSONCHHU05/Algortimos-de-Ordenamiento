#Alumno1:JEFERSON CHACON HUAMAN
#Alumno2:ZUÑIGA  CARDENAS LUCIANA VALERIA
#Alumno3:HUAMAN CHOQUE RODRIGO
#Alumno4:SANCHEZ ESCALANTE LUIGUI JAFFET
#Alumno5:TTITO HUALLPA JOSE ARMANDO
#Fecha: 20/09/2021
#Accion: Ordenar los elementos de un arreglo en metodo burbuja
#Decalrar los vectores
a=[1,6,2,4,8,2,5,9,2]
b=[4,1,7,3,7,0,1,3,8]
def metodo_burbuja(vector):
    permutation = True
    iteracion = 0
    #Hace la comparacion desde el primero al ultimo si hay un intercambio
    #Esto continuara hasta no haber intercambio
    while permutation == True:
        permutation = False
        iteracion = iteracion + 1
        # Explora la lista
        for actual in range(0, len(vector) - iteracion):
            #Intercambiamos los dos elementos y los actualiza
            if vector[actual] > vector[actual + 1]:
                permutation = True
                vector[actual], vector[actual + 1] = \
                vector[actual + 1],vector[actual]
                #Mostrar la comparacion de izquierda a derecha
                print(vector[actual + 1],"se compara a", vector[actual])
    return vector
#Mostrar el vector en forma ordenada
print(a)
print(metodo_burbuja(a))
print(b)
print(metodo_burbuja(b))
