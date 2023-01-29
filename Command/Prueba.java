
public class Prueba
{
       public static void main(String [] args){

        

        Command command = new ApagarLuces();



        if(args[0].equals("encender") && args[1].equals("luces")){

                command = new EncenderLuces();

        } else if(args[0].equals("apagar") && args[1].equals("luces")){

                command = new ApagarLuces();

        } else if(args[0].equals("abrir") && args[1].equals("portada")){

                command = new AbrirPortada();

        } else if(args[0].equals("cerrar") && args[1].equals("portada")){

                command = new CerrarPortada();

        }



        Invoker invoker = new Invoker(command);

        invoker.run();

        

    }
}


