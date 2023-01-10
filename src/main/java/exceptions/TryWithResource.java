package exceptions;

public class TryWithResource {

    public static void main(String[] args) {

        final X x = new X();
        final Y y = new Y();
        final Z z = new Z();
        try(z;x;y) {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    static class X implements AutoCloseable {

        @Override
        public void close() throws Exception {
            System.out.println("X closed");
        }
    }

    static class Y implements AutoCloseable {

        @Override
        public void close() throws Exception {
            System.out.println("Y closed");
        }
    }

    static class Z implements AutoCloseable {

        @Override
        public void close() throws Exception {
            System.out.println("Z closed");
        }
    }
}
