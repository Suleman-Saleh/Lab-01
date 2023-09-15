public class Rectangle {
    double lenght;
    double widht;
public double area(){
    if (lenght < 0){
        return 0;
    }
    else {
        return lenght * widht;
    }
}
}

