package ttt;
//Alumno1:JEFERSON CHACON HUAMAN
//Alumno2:ZUÑIGA  CARDENAS LUCIANA VALERIA
//Alumno3:HUAMAN CHOQUE RODRIGO
//Alumno4:SANCHEZ ESCALANTE LUIGUI JAFFET
//Alumno5:TTITO HUALLPA JOSE ARMANDO
//Fecha: 20/09/2021
//Accion: Ordenar los elementos de un arreglo en metodo peine
public class OrdenamientoPeine{
    public static int[] combSort(int[] theArray) {
        int theLen = theArray.length;
        int i = (int) (theLen/1.3);
        while(i >=1){
                for(int j=0;  j<theLen; j++) {
                        if (i+j >= theLen) {
                                 i = (int)(i/1.3);
                                 break;
                        }else {
                                 if (theArray[j] > theArray[i+j]) {
                                          int tmp = theArray[j];
                                          theArray[j] = theArray[i+j];
                                          theArray[i+j] = tmp;                      
                                 }
                        }
                }
        }
        return theArray;
    }
    public static void main(String[] args) {
        int []theArray = {10, 1, 18, 30, 23, 12, 7, 5, 18, 17 };
        System.out.print ("Ordenar antes: ");
        for(int i = 0; i < theArray.length; i++) {
            System.out.print(theArray[i] + " ");
        }
        
        int []resultArray = combSort(theArray);
        
             System.out.print ("Peine ordenar: ");
        for (int i = 0; i < resultArray.length; i++){
             System.out.print(resultArray[i] + " ");
        } 
    }
}
