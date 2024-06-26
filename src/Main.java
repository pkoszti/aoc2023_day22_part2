import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main (String[] args) throws IOException {

        Instant start = Instant.now();

        Brick.loadBricks(2);//choose 1 or 2 for input file

        int allFallenBricks = Brick.allFall();

        long processingTime = Duration.between(start, Instant.now()).toMillis();//on average about 260 milliseconds

        System.out.println("Calculated result " + allFallenBricks + " in " + processingTime + " milliseconds.");
    }
}
