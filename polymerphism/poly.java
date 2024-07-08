public class poly{
    public static void main(String[] args) {

        rectangle r = new rectangle();
        r.render();
        
        circle c = new circle();

        c.render();

        polygon p = new polygon();
        p.render();
        
    }
}

class polygon{
    public void render(){
        System.out.println("it is polygon");
    }
}

class rectangle extends  polygon{
    public void render(){
        System.out.println("Rectangle render here");
    }

}

class circle extends  polygon{
    public void render(){
        System.out.println("circle is rendered");
    }
}