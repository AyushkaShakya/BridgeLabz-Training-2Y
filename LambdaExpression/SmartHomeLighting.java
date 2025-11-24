package LambdaExpression;

// Functional Interface
interface LightAction {
    void execute();
}

public class SmartHomeLighting {
    public static void main(String[] args) {

        LightAction motion = () -> 
            System.out.println("Motion detected → Turning ON hallway lights.");

        LightAction nightTime = () -> 
            System.out.println("Night time → Switching to warm dim lights.");

        LightAction voiceCommand = () -> 
            System.out.println("Voice command → Activating party mode lights.");

        motion.execute();
        nightTime.execute();
        voiceCommand.execute();
    }
}