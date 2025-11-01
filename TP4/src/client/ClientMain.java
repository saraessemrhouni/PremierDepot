package client;

import org.omg.CORBA.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

public class ClientMain {
    public static void main(String[] args) {
        try {
            ORB orb = ORB.init(args, null);

            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            String name = "Hello";
            Hello hello = HelloHelper.narrow(ncRef.resolve_str(name));

            System.out.println("Connected to server.");
            System.out.println("Server message: " + hello.HelloMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
