


/* task
 * make a interface media
 * make the followoing finction\
 * vodi plaey()
 * void pause()
 * void next()
 * void previous()
 * String nowplaying()
 * make an interface deigital media extending media 
 * amke the follwoing function
 * double isze()
 * double remaining (double current)
 * 
 * make an interface onlineAsset
 * make the follwing function
 * void download()
 * 
 * make a class spotify and implement difital media
 */


public class task {
    public static void main(String[] args) {
        mobile myMobile = new mobile();
        myMobile.play();
        myMobile.pause();
        myMobile.next();
        myMobile.previous();
        myMobile.size();
        myMobile.remaining(10.0);
        myMobile.download();


        
        
    }

}
interface Media {
    public void play();
    public void pause();
    public void next();
    public void previous();
    public boolean nowplaying(String play);
}
interface digitalmedia extends Media{
    public  double size();
    public double remaining (double current) ;

}
interface onlineAsset extends digitalmedia{
    void download();
}

class mobile implements onlineAsset{

    @Override 
    public double remaining (double current){
        System.out.println("Double your valeue");
        return 0;
    }

    @Override
    public  double size(){
        System.out.println("THis is the thign which show sizes");
        return 1;
    }

    @Override
    public void download(){
        System.out.println("This is the downloader");
    }
    @Override
    public void play(){
        System.out.println("We can play game");
    }
    @Override
    public void pause(){
        System.out.println("We can pause the game");


    }
    @Override
    public void next(){
        System.out.println("We can play next video");
    }

    @Override
    public void previous(){
        System.out.println("We can play previous video");
    }
    @Override
    public boolean nowplaying(String play){
        System.out.println("WE cannot play game");
        return false;
    }


}