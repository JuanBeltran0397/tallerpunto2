import java.util.*;
//import java.util.stream.*;

public class MainPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//se declara un objeto Scanner para leer datos desde la entrada estándar
        List<Persona> personas = new ArrayList<>();// se declara una lista de objetos tipo Persona
        String continuar;


        do {
            System.out.println("por favor ingrese los datos de la persona: ");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Apellido: ");
            String apellido = sc.nextLine();

            System.out.print("Edad: ");
            int edad = sc.nextInt();

            System.out.print("Genero: ");
            String genero = sc.next().toLowerCase();

            System.out.print("Sueldo por hora: ");
            int sueldohora = sc.nextInt();

            System.out.print("Cargo: ");
            String cargo = sc.next().toLowerCase();

            // se crea un objeto Persona con los datos ingresados
            personas.add(new Persona(nombre, apellido, edad, genero, sueldohora, cargo));

            System.out.print("¿Desea agregar otra persona? (s/n): ");
            continuar = sc.next().trim().toLowerCase();

            sc.nextLine(); // Limpiar el buffer del scanner después de leer un entero o caracter

        }while(continuar.equals("s"));


        //se imprime la cantidad de personas ingresadas
        long cantidadPersonas = personas.stream().count();
        System.out.println("Cantidad de personas ingresadas: " + cantidadPersonas);

        // promedio de edad
        double promedioEdad = personas.stream()
                                      .mapToInt(Persona::getEdad)
                                      .average()
                                      .orElse(0.0);
        System.out.printf("Promedio de edad: %.2f%n", promedioEdad);

        // personas mayores de 18 años
        long mayoresDe18 = personas.stream()
                                      .filter(p -> p.getEdad() > 18)
                                      .count();
        System.out.println("Cantidad de personas mayores de edad: " + mayoresDe18);

        // Nombres que comienzan con 'A'
        System.out.println("Nombres que comienzan con 'A':");
        personas.stream()
                .filter(p -> p.getNombre().toLowerCase().startsWith("a"))
                .forEach(System.out::println);

        // personas con la letra 'M' en el apellido
        System.out.println("Personas con la letra 'M' en el apellido:");
        personas.stream()
                .filter(p -> p.getApellido().toLowerCase().contains("m"))
                .forEach(System.out::println);

    }
}



