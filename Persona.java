public class Persona {
   private String nombre;
   private int edad;
   private int poblacion;

   public Persona(String nombre,int edad, int poblacion){
      this.nombre = nombre;
      this.edad = edad;
      this.poblacion = poblacion;
   }
	
   public Persona() {
      this.nombre=null;	  
   }
	 
   public void setNombre(String nom){
      nombre = nom;
   }

   public void setEdad(int ed){
      edad = ed;
   }

   public String getNombre(){
      return nombre;
   }
   
   public int getEdad(){
      return edad;
   }

}//fin Persona
