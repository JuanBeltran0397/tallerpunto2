public class Persona {
    // declaracion de atributos
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private int sueldohora;
    private String cargo;

    //metodo constructor
    public Persona(String nombre, String apellido, int edad, String genero, int sueldohora, String cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.sueldohora = sueldohora;
        this.cargo = cargo;
    }

    //metodos get
    public String getNombre() {
        return nombre;}
    public String getApellido() {
        return apellido;}
    public int getEdad() {
        return edad;}
    public String getGenero() {
        return genero;}
    public int getSueldohora() {
        return sueldohora;}
    public String getCargo() {
        return cargo;}

    //metodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;}
    public void setApellido(String apellido) {
        this.apellido = apellido;}
    public void setEdad(int edad) {
        this.edad = edad;}
    public void setGenero(String genero) {
        this.genero = genero;}
    public void setSueldohora(int sueldohora) {
        this.sueldohora = sueldohora;}
    public void setCargo(String cargo) {
        this.cargo = cargo;}

    //metodo toString
    @Override
    public String toString() {
        return nombre+ " "+ apellido +", Edad: "+ edad + ", Genero: "+ genero + ", Sueldo por hora: " + sueldohora + ", Cargo: " + cargo;
    }
}
