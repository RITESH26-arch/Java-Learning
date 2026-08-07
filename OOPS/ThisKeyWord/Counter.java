public class Counter {
    int count;

    Counter(int count){
        this.count = count;
    }

    Counter increment(){
        this.count = this.count +1;
        return this;
    }

}
