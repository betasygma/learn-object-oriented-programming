
/**
 * Text-based entry point and user interface loop. Instantiates a 
 * VendingMachine, reads user commands from the console, dispatches 
 * buy and admin actions, and cleanly shuts down the simulation.
 *
 * @author (Bara S. Rohmani)
 * @version (v1.0 — 2025-10-14)
 */

import java.util.Scanner;

public class VendingSim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VendingMachine vm = new VendingMachine(scanner);
        vm.run();
        scanner.close();
    }
}