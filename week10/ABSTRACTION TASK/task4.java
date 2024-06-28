// 6. You are developing a media player application. There is a base class called MediaPlayer, which has methods 
// like play(), pause(), and stop(). The VideoPlayer class inherits from MediaPlayer and adds methods like rewind() 
// and fastForward(). Additionally, there is an interface called Playlist, which defines methods like addSong() and 
// removeSong(). The VideoPlayer class implements the Playlist interface. Implement the classes and demonstrate inheritance 
// with interface by creating objects of the VideoPlayer class and calling its methods as well as the interface methods.



public class task4 {
    public static void main(String[] args) {
        Listen l1 = new Listen();
        l1.addSong();
        l1.pause();
        l1.removeSong();
        l1.fastForward();
        l1.stop();
        l1.fastForward();
        l1.play();
        
    }
}

abstract class MediaPlayer {
    public abstract  void play();

    public abstract  void pause();

    public abstract  void stop();



    
}
abstract class VideoPlayer extends MediaPlayer {
    public abstract  void rewind() ;
    public abstract  void fastForward();
}
abstract  class Playlist extends VideoPlayer {
    public abstract void addSong();
    public abstract void removeSong();

}
class Listen extends Playlist{
@Override
public void play(){
    System.err.println("Let's play");
}
@Override
public void pause(){
    System.err.println("Let's pausse");
}
@Override
public void stop(){
    System.err.println("Let's stop");
}@Override
public void rewind(){
    System.err.println("Let's rewind");
}

@Override
public void fastForward(){
    System.err.println("Let's fastforward");
}
@Override
public void addSong(){
    System.err.println("Let's addsong");
}
@Override
public void removeSong(){
    System.err.println("Let's remove song");
}}