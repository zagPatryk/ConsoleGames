//package GothicChest.Old;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.Scanner;
//
//import javax.sound.sampled.AudioInputStream;
//import javax.sound.sampled.AudioSystem;
//import javax.sound.sampled.Clip;
//import javax.sound.sampled.LineUnavailableException;
//import javax.sound.sampled.UnsupportedAudioFileException;
//
//class SimpleAudioPlayer
//{
//
//    // to store current position
//    Long currentFrame;
//    Clip clip;
//
//    // current status of clip
//    String status;
//
//    AudioInputStream audioInputStream;
//    static String filePath;
//
//    // constructor to initialize streams and clip
//    public SimpleAudioPlayer()
//            throws UnsupportedAudioFileException,
//            IOException, LineUnavailableException
//    {
//        // create AudioInputStream object
//        audioInputStream =
//                AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
//
//        // create clip reference
//        clip = AudioSystem.getClip();
//
//        // open audioInputStream to the clip
//        clip.open(audioInputStream);
//
//        clip.loop(Clip.LOOP_CONTINUOUSLY);
//    }
//
//    public static void main(String[] args)
//    {
//        try
//        {
//            filePath = "Your path for the file";
//            SimpleAudioPlayer audioPlayer =
//                    new SimpleAudioPlayer();
//
//            audioPlayer.play();
//            Scanner sc = new Scanner(System.in);
//
//            while (true)
//            {
//                System.out.println("1. pause");
//                System.out.println("2. resume");
//                System.out.println("3. restart");
//                System.out.println("4. stop");
//                System.out.println("5. Jump to specific time");
//                int c = sc.nextInt();
//                audioPlayer.gotoChoice(c);
//                if (c == 4)
//                    break;
//            }
//            sc.close();
//        }
//
//        catch (Exception ex)
//        {
//            System.out.println("Error with playing sound.");
//            ex.printStackTrace();
//
//        }
//    }
//
//    // Work as the user enters his choice
//
//    private void gotoChoice(int c)
//            throws IOException, LineUnavailableException, UnsupportedAudioFileException
//    {
//        switch (c)
//        {
//            case 1:
//                break;
//            case 2:
//                break;
//            case 3:
//                break;
//            case 4:
//                break;
//            case 5:
//                System.out.println("Enter time (" + 0 +
//                        ", " + clip.getMicrosecondLength() + ")");
//                Scanner sc = new Scanner(System.in);
//                long c1 = sc.nextLong();
//                break;
//
//        }
//
//    }
//
//    // Method to play the audio
//    public void play()
//    {
//        //start the clip
//        clip.start();
//
//        status = "play";
//    }
//
//}