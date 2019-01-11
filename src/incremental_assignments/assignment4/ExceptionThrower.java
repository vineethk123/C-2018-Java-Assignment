package incremental_assignments.assignment4;

public class ExceptionThrower {

    public void throwException(int number) throws ExceptionOne, ExceptionTwo, ExceptionThree, NullPointerException {
        switch (number) {
            case 1:
                throw new ExceptionOne("Exception One");
            case 2:
                throw new ExceptionTwo("Exception Two");
            case 3:
                throw new ExceptionThree("Exception Three");
            default:
                throw new NullPointerException("Null Pointer Exception");
        }
    }
}

