import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);


        //1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        System.out.println("EJERCICIO 1");
        String[] nombres = new String[]{"Pepe", "María", "José", "Juan"};

        for (String nombre : nombres) {
            System.out.println("El nombre es: " + nombre);
        }


        //2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
        System.out.println("\nEJERCICIO 2");

        int[][] numeros = new int[4][3];
        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[1][0] = 4;
        numeros[1][1] = 5;
        numeros[1][2] = 6;
        numeros[2][0] = 7;
        numeros[2][1] = 8;
        numeros[2][2] = 9;
        numeros[3][0] = 10;
        numeros[3][1] = 11;
        numeros[3][2] = 12;

        for (int i = 0; i < numeros.length; i++) {

            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("El valor es: " + numeros[i][j] + " en la posición: " + "[" + i + "]" + "[" + j + "]");
            }

        }


        //3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
        System.out.println("\nEJERCICIO 3");

        Vector<Integer> openBootCamp = new Vector<>();
        openBootCamp.add(1);
        openBootCamp.add(2);
        openBootCamp.add(3);
        openBootCamp.add(4);
        openBootCamp.add(5);

        openBootCamp.remove(1);
        openBootCamp.remove(1);
        System.out.println(openBootCamp);


        //4. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
        System.out.println("\nEJERCICIO 4");

        System.out.println("¿Cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo?" + "\nEl problema es que la memoria aumentaría conforme la capacidad límite se alcance, creando una copia de los elementos en un array (con el doble del tamaño) en donde se guardarían los elementos y se guardarían los nuevos, haciendo que el uso de memoria sea muy grande al existir los datos duplicados en el antiguo array y en el nuevo.");

        //5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
        System.out.println("\nEJERCICIO 5");

        ArrayList<String> elementos = new ArrayList<>();
        elementos.add("OpeenBootcamp");
        elementos.add("es");
        elementos.add("lo");
        elementos.add("mejor");
        LinkedList<String> elementos2 = new LinkedList<>(elementos);

        System.out.println("\nArrayList");
        for (String elements : elementos) {
            System.out.println(elements);
        }

        System.out.println("\nLinkedList");
        for (String elements2 : elementos2) {
            System.out.println(elements2);
        }

        //6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
        System.out.println("\nEJERCICIO 6");
        ArrayList<Integer> num = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            num.add(i);
        }


        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) % 2 == 0) {
                num.remove(i);
            }

        }
        for (int i = 0; i < num.size(); i++) {
            System.out.println(num.get(i));
        }

        //Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
        System.out.println("\nEJERCICIO 7");

        try{
            int variableA =8;
            int variableB =0;

            System.out.println(dividePorCero(variableA, variableB));

        } catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }


        //8. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
        System.out.println("\nEJERCICIO 8");

        try{
            String inDocumento = "/etc/passwd";
            String outDocumento = "copiaejercicio.txt";
            copyFile(inDocumento, outDocumento);
        } catch (IOException e){

        }

        //9. Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
        System.out.println("\nEJERCICIO 9");
        System.out.println("\nEscribe una lista de 6 productos que usualmente compras en el supermercado: ");
        HashMap<Integer, String> listaSuper = new HashMap<>();
        System.out.println();
        System.out.println("Escribe el producto 1");
        listaSuper.put(1, scanner.next());
        System.out.println("Escribe el producto 2");
        listaSuper.put(2, scanner.next());
        System.out.println("Escribe el producto 3");
        listaSuper.put(3, scanner.next());
        System.out.println("Escribe el producto 4");
        listaSuper.put(4, scanner.next());
        System.out.println("Escribe el producto 5");
        listaSuper.put(5, scanner.next());
        System.out.println("Escribe el producto 6");
        listaSuper.put(6, scanner.next());

        System.out.println("\nTu lista de productos es la siguiente: ");
        for(Map.Entry shoList : listaSuper.entrySet()){
            System.out.println(shoList.getKey() + " " + shoList.getValue());
        }


        System.out.println("\n¿Deseas modificar algún elemento? Escribe si para modificar un elemento o no si es que la lista es correcta");
        String listaCorrecta = scanner.next();;

        while(listaCorrecta.equals("si")) {
            System.out.println("\nIngrese el numero del producto que desea modificar y posteriormente el nuevo producto");
            listaSuper.put(scanner.nextInt(), scanner.next());

            System.out.println("\nTu lista de productos es la siguiente: ");
            for(Map.Entry shoList : listaSuper.entrySet()){
                System.out.println(shoList.getKey() + " " + shoList.getValue());
            }

            System.out.println("\n¿Deseas modificar algún elemento? Escribe si para modificar un elemento o no si es que la lista es correcta");
            listaCorrecta = scanner.next();;

        }

        System.out.println("¿Desea guardar su lista en un documento de texto? Escriba 1 para SÍ y 2 para Salir");
        int savelist = scanner.nextInt();
        if(savelist == 1){
                FileOutputStream fout = new FileOutputStream("listasuper.txt");
                ObjectOutputStream out= new ObjectOutputStream(fout);
                out.writeObject(listaSuper.toString());
                out.close();
        }


    }

    public static int dividePorCero(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void copyFile (String fileIn, String fileOut) throws IOException {
        InputStream in = new FileInputStream(fileIn);
        byte[] datos = in.readAllBytes();

        PrintStream out = new PrintStream(fileOut);
        out.write(datos);
    }

}
