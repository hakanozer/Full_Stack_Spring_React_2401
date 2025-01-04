package useInterface;


public class MainInterface {
    public static void main(String[] args) {

        UserImpl user = new UserImpl();
        IUser iUser = new UserImpl();

        ActionImpl action1 = new ActionImpl();
        IA action2 = new ActionImpl();
        IB action3 = new ActionImpl();

        IA ia = new IA() {
            @Override
            public void call1() {

            }

            @Override
            public void call2() {

            }
        };


    }
}

// sum(int a, int b)
// topla( int a, int b )
// sumx(int number1, int number2 )
// call( int num1, num2 )
// oran( int a, int b )
