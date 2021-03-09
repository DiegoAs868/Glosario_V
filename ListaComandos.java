
public class ListaComandos {
	String comando [] = new String [27];
    String descripcion [] = new String [27];
    
	String tema[] = new String [27];
	String descripcionTema[] = new String [27];

    ListaComandos(){

    comando[0] = "pwd";
    comando[1] = "ls";
    comando[2] = "cd";
    comando[3] = "mkdir";
    comando[4] = "touch";
    comando[5] = "sudo updatedb";
    comando[6] = "locate";
    comando[7] = "rmdir";
    comando[8] = "cp";
    comando[9] = "cat";
    comando[10] = "fg";
    comando[11] = "kill";
    comando[12] = "apt";
    comando[13] = "zypper";
    comando[14] = "rpm";
    comando[15] = "pip";
    comando[16] = "composer";
    comando[17] = "npm";
    comando[18] = "head";
    comando[19] = "tail";
    comando[20] = "rm";
    comando[21] = "mv"; 
  comando[22] = "grep";
    comando[23] = "sed";
    comando[24] = "nl";
    comando[25] = "chown";
    comando[26] = "gzip";

    descripcion[0]= "El comando pwd indica la dirección donde estamos ubicados";
    descripcion[1]= "Enlista los elmentos del del directorio actual o al que se le dirija";
    descripcion[2]= "Permite movernos entre directorios o desde los directorios ~   y  / ";
    descripcion[3]= "Se utiliza para crear un directorio nuevo";
    descripcion[4]= "Utilizado para crear un archivo nuevo";
    descripcion[5]= "con este comando ejecutado como usuario root podremos actualizar la base de datos de nuestro sistema operativo.";
    descripcion[6]= "con el comando (locate) seguido del nombre del archivo podemosrealizar una busqueda ";
    descripcion[7]= "permite eliminar un directorio ( no se puede eliminar un directorio con contenido).";
    descripcion[8]= "permite copiar un archivo especificando el nombre delarchivo con su extensión y el lugar a donde se deseamovilizar";
    descripcion[9]= "crear un .txt y ver el contenido de un archivo";
     descripcion[10]= "Para regresar ese proceso y otro podemos realizarlo con el comando fg directamente en la terminal.";
    descripcion[11]= "utilizado para cortar o matar un proceso";
    descripcion[12]= "este se utiliza para las distribuciones de linux basadas en Debian tales como ubuntu"; 
    descripcion[13]= "este se utiliza para distribuciones de linux como SUSE o OpenSUSE";
    descripcion[14]= "este es el administrador de paquete universal sin embargo es algo rustico su uso";
   descripcion[15]= "utilizado para instalar paquetes de pyton";
   descripcion[16]= "para paquetes de php";
   descripcion[17]= "utilizado para paquetes de node JS";
   descripcion[18]= "el comando head seguido del nombre de un archivo muestra el contenido de las primeras líneas.";
   descripcion[19]= "este comando realiza todo lo contrario del comando head";
   descripcion[20]= "permite eliminar un archivo, especificando luego del comando el nombre del archivo con su extensión.";
   descripcion[21]= "permite movilizar un archivo de un directorio a otro.";
   descripcion[22]= "este comando permite localizar entre las líneas del documento si existe la palabra que le indiquemos.";
   descripcion[23]= "este comando permite sustituir una palabra por otra en  Todo el flujo del documento a momento de mostrarse este Comando no modifica el archivo.";
   descripcion[24]= "muestra el documento con la lineas enumeradas sin embargo no toma en cuenta las lineas vasias pero con algunas opciones podemos ver con mas detalles.";
   descripcion[25]= "con este comando cambiamos al propietario del archivo con permisos de administrador..";
   descripcion[26]= "con este comando cambiamos al propietario del archivo con permisos de administrador..con este comando seguido del nombre del archivo podremos comprimir el su tamaño en un archivo .gz"; 

    tema[0]="directorio";
    
    descripcionTema[0]="\n CREAR UN DIRECTORIO:\n     para crear un directorio utiliza\n     el siguientes"
    + " comando.\n\n     mkdir nombreDirectorio\n"
    + " \n ELIMINAR UN DIRECTORIO:\n"
    + "     utiliza el siguiente comando seguido\n     del nombre del directorio a eliminar."
    + "\n\n     mkdir nombreDirectorio\n";
    
    }

    public void buscarComando(String comando) {
    	ListaComandos insta = new ListaComandos();
    	String comandoIngresado = comando;
    	
        for(int i = 0; i < insta.comando.length; i++ ){
        	
        	if(comandoIngresado.equals(insta.comando[i])){
        		System.out.println("     "+descripcion[i]);
        	}else {
        		if(comandoIngresado.equals(insta.tema[i])) {
        			System.out.println("     "+descripcionTema[i]);
        		}
        	}
        	
        }
     }

}

