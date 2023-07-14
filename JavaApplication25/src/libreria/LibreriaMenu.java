package libreria;

import java.util.Scanner;
import libreria.Services.AutorService;
import libreria.Services.EditorialService;
import libreria.Services.LibroService;

public class LibreriaMenu {

    private AutorService autorService;
    private EditorialService editorialService;
    private LibroService libroService;
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public LibreriaMenu() {
        autorService = new AutorService();
        editorialService = new EditorialService();
        libroService = new LibroService();
    }

    public void menu() {
        int opc;
        do {
            System.out.println("--- MENU ---"
                    + "\n1 - ABML Autor"
                    + "\n2 - ABML Editorial"
                    + "\n3 - ABML Libro"
                    + "\n4 - Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    menuAutor();
                    break;
                case 2:
                    menuEditorial();
                    break;
                case 3:
                    menuLibro();
                    break;
                case 4:
                    System.out.println("Salió del sistema");
                    break;
                default:
                    System.out.println("\n  Opcion no valida  \n");
            }
        } while (opc != 4);
    }

    public void menuAutor() {
        int opc;
        do {
            System.out.println("--- ABML Autor ---"
                    + "\n1 - Alta de autor"
                    + "\n2 - Baja de autor"
                    + "\n3 - Modificar autor"
                    + "\n4 - Lista autores"
                    + "\n5 - Busca autor por nombre"
                    + "\n6 - Volver al menu principal"
                    + "\n\n0 - Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    autorService.crearAutor();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    menu();
                    break;
                case 0:
                    System.out.println("Salió del sistema");
                    break;
                default:
                    System.out.println("\n  Opcion no valida  \n");
            }
        } while (opc != 0);
    }

    public void menuEditorial() {
        int opc;
        do {
            System.out.println("--- ABML Editorial ---"
                    + "\n1 - Alta de editorial"
                    + "\n2 - Baja de editorial"
                    + "\n3 - Modificar editorial"
                    + "\n4 - Lista editoriales"
                    + "\n5 - Volver al menu principal"
                    + "\n\n0 - Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    autorService.crearAutor();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    menu();
                    break;
                case 0:
                    System.out.println("Salió del sistema");
                    break;
                default:
                    System.out.println("\n  Opcion no valida  \n");
            }
        } while (opc != 0);

    }

    public void menuLibro() {
        System.out.println("No terminado");
    }

}
