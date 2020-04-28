//package GothicChest;
//
//import java.util.*;
//
//public class GothicChestRunner {
//    public static void asd() {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj swoje imie");
//        String input = scanner.nextLine();
//        //Player player = new Player(input);
//        //System.out.println(player);
//
//        Options o = new Options();
//        o.help();
//
//        CombinationRandomizer combinationRandomizer = new CombinationRandomizer();
//        List<String> combination = combinationRandomizer.getCombination(5);
//        Deque<String> queue = new ArrayDeque<>(combination);
//
//        //Sound sound = new Sound();
//        //sound.playSound();
//
//        while (player.getLockpicksNumber() > 0 && queue.size() > 0) {
//            System.out.println("W którą stonę skręcić wytrych? W L(lewo) czy w P(prawo)?" + player.getLockpicksNumber());
//            System.out.println(queue);
//            input = scanner.nextLine();
//
//            if(input.equals("P") || input.equals("L")) {
//                if (queue.poll().equals(input)) {
//                    player.addDexterity();
//                    System.out.println("Trylylyly");
//                } else {
//                    player.brokenLockpick();
//                    queue = new ArrayDeque<>(combination);
//                    System.out.println("Zacznij od zera");
//                }
//            } else if(input.equals("H")) {
//                o.help();
//            } else if(input.equals("D")) {
//                o.help();
//            } else if(input.equals("W")) {
//                o.help();
//            } else if(input.equals("Q")) {
//                break;
//            }
//        }
//        scanner.close();
//        System.out.println(1111111);
//    }
//}
