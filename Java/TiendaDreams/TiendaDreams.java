import java.util.*;

public class TiendaDreams {
    private static List<Producto> inventario = new ArrayList<>();
    private static List<Cliente> clientes = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- MENÚ TIENDA DREAMS ---");
            System.out.println("1. Registrar producto");
            System.out.println("2. Registrar cliente");
            System.out.println("3. Mostrar inventario");
            System.out.println("4. Registrar venta");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> registrarProducto();
                case 2 -> registrarCliente();
                case 3 -> mostrarInventario();
                case 4 -> registrarVenta();
                case 0 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción inválida");
            }
        } while (opcion != 0);
    }

    private static void registrarProducto() {
        System.out.print("Nombre del producto: ");
        String nombre = sc.nextLine();
        System.out.print("Precio: ");
        double precio = sc.nextDouble();
        sc.nextLine();
        System.out.print("Categoría: ");
        String cat = sc.nextLine();
        System.out.print("Stock: ");
        int stock = sc.nextInt();
        sc.nextLine();

        inventario.add(new Producto(nombre, precio, cat, stock));
        System.out.println("✅ Producto agregado.");
    }

    private static void registrarCliente() {
        System.out.print("Nombre del cliente: ");
        String nombre = sc.nextLine();
        System.out.print("Correo: ");
        String correo = sc.nextLine();

        clientes.add(new Cliente(nombre, correo));
        System.out.println("✅ Cliente registrado.");
    }

    private static void mostrarInventario() {
        System.out.println("\n--- Inventario ---");
        for (int i = 0; i < inventario.size(); i++) {
            System.out.println((i + 1) + ". " + inventario.get(i));
        }
    }

    private static void registrarVenta() {
        if (clientes.isEmpty() || inventario.isEmpty()) {
            System.out.println("⚠️ Debe haber clientes y productos registrados.");
            return;
        }

        System.out.println("\nSeleccione cliente:");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i + 1) + ". " + clientes.get(i));
        }
        int cIdx = sc.nextInt() - 1;
        sc.nextLine();
        Cliente cliente = clientes.get(cIdx);

        Venta venta = new Venta(cliente);

        char continuar;
        do {
            mostrarInventario();
            System.out.print("Seleccione producto: ");
            int pIdx = sc.nextInt() - 1;
            System.out.print("Cantidad: ");
            int cantidad = sc.nextInt();
            sc.nextLine();

            venta.agregarProducto(inventario.get(pIdx), cantidad);

            System.out.print("¿Agregar otro producto? (s/n): ");
            continuar = sc.nextLine().toLowerCase().charAt(0);
        } while (continuar == 's');

        venta.calcularTotal();
        venta.mostrarFactura();
    }
}
