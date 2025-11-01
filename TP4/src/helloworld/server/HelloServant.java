package helloworld.server;

import org.omg.CORBA.ORB;

public class HelloServant extends HelloPOA {
    private String message = "Bonjour tous le monde !!";
    private ORB orb;

    public void setOrb(ORB orb) {
        this.orb = orb;
    }

    @Override
    public String HelloMessage() {
        return message;
    }

    @Override
    public void HelloMessage(String newHelloMessage) {
        this.message = newHelloMessage;
    }
}
