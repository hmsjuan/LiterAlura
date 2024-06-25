package com.hmsjuan.challenger.literalura.principal;

public class MenuPrincipal {
        public LibroRepository libroRepository;
        private AutorRepository autorRepository;
        private Scanner teclado = new Scanner(System.in);
        private ConsumoApi consumoApi = new ConsumoApi();
        private ConvierteDatos convierteDatos = new ConvierteDatos();
        private DatosLibro datosLibro;
        private DatosAutor datosAutor;
        private LibroServices libroServices = new LibroServices();
        private AutorServices autorServices = new AutorServices();

        private Autor autorDelLibro;
        private int opciones = -1;


        private List<Autor> autores;
        private List<Libro> libros;


        public PantallaPrincipal(LibroRepository libroRepository, AutorRepository autorRepository) {
            this.autorRepository = autorRepository;
            this.libroRepository = libroRepository;
        }


        public void muestraElMenu() throws Exception {


            var textoMenu = """
                \nM E N U  P R I N C I P A L - L I T E R  A L U R A 
                
                [ 1 ] Buscar libro por titulo
                [ 2 ] Listar libro registrados
                [ 3 ] Listar autor registrados
                [ 4 ] Listar autor vivos en un determinado año
                [ 5 ] Listar libro por idioma
                [ 6 ] Top 5 libros más descargados
                [ 7 ] Listado de libros por autor
                
                       \s
                [ 0 ] Salir
                \n
                Elija un Opción a través del número correspondiente:
               \s""";

            do {
                System.out.print(textoMenu);
                opciones = teclado.nextInt();
                teclado.nextLine();

                switch (opciones) {
                    case 1 ->obtenerLibroPorTitulo();
                    case 2 ->listarLibrosRegistrados();
                    case 3 ->listarAutoresRegistrados();
                    case 4 ->listarAutoresVivosPorAno();
                    case 5 ->listarLibrosPorIdioma();
                    case 6->top10LiborsDescargados();
                    case 7 ->listadoDeLibrosPorAutor();



                    case 0-> System.out.println("Hasta Luego");
                    default -> System.out.println("Opción Inválida");
                }
            }
            while (opciones != 0);
        }

}
