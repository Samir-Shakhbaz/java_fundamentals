package labs_examples.lambdas.labs.lambdaHW;

public class InstanceReferenceMain {

    public static void main(String[] args) {

        InstanceReference inst =  new InstanceReference();
        inst.method();
        System.out.println("also I can access b " + inst.b);

    }

}
