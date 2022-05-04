package Week6_StringHandling_Synchronized_IPC_Deadlock.Synchronized_IPC_Deadlock;

public class DeadLockDemo {
    public static void main(String[] args) {
        String resource1 = "Rohith Pala";
        String resource2 = "Amarnath Pala";

        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    // t1 locks resource1
                    //sleeps for 100ms
                    //After 100ms it tries to go into resource2 but it is locked by t2
                    System.out.println("Thread 1 has locked resource 1");

                    try {
                        Thread.sleep(1000);
                        //t2 gets created
                    } catch (Exception exception) {
                        System.out.println(exception);
                    }

                    synchronized (resource2) {
                        System.out.println("Thread 1 has locked resource 2");
                        try {
                            Thread.sleep(1000);
                            //t2 gets created
                        } catch (Exception exception) {
                            System.out.println(exception);
                        }
                        System.out.println("Thread 1 exited");
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    // t1 locks resource2
                    System.out.println("Thread 2 has locked resource 2");

                    try {
                        Thread.sleep(1000);
                        //sleeps for 100ms
                        //After 100ms it tries to go into resource1 but it is locked by t1
                    } catch (Exception exception) {
                        System.out.println(exception);
                    }

                    synchronized (resource1) {
                        System.out.println("Thread 2 has locked resource 1");
                        try {
                            Thread.sleep(1000);
                            //t2 gets created
                        } catch (Exception exception) {
                            System.out.println(exception);
                        }
                        System.out.println("Thread 2 exited");
                    }
                }
            }
        };

        t1.start();
        t2.start();

        //Deadlock can be avoided by avoiding using nested synchronized blocks and decreasing the number of unnecessary locks
        //By Giving resource1 first and then the resource2 deadlock can be avoided
    }
}

//This is ne of the solutions to avoid deadlock
/*package Week6;

public class DeadLockDemo {
    public static void main(String[] args) {
        String resource1 = "Rohith Pala";
        String resource2 = "Amarnath Pala";

        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    // t1 locks resource1
                    //sleeps for 100ms
                    //After 100ms it tries to go into resource2 but it is locked by t2
                    System.out.println("Thread 1 has locked resource 1");

                    try {
                        Thread.sleep(1000);
                        //t2 gets created
                    } catch (Exception exception) {
                        System.out.println(exception);
                    }

                    synchronized (resource2) {
                        System.out.println("Thread 1 has locked resource 2");
                        try {
                            Thread.sleep(1000);
                            //t2 gets created
                        } catch (Exception exception) {
                            System.out.println(exception);
                        }
                        System.out.println("Thread 1 exited");
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    // t1 locks resource2
                    System.out.println("Thread 2 has locked resource 2");

                    try {
                        Thread.sleep(1000);
                        //sleeps for 100ms
                        //After 100ms it tries to go into resource1 but it is locked by t1
                    } catch (Exception exception) {
                        System.out.println(exception);
                    }

                    synchronized (resource2) {
                        System.out.println("Thread 2 has locked resource 1");
                        try {
                            Thread.sleep(1000);
                            //t2 gets created
                        } catch (Exception exception) {
                            System.out.println(exception);
                        }
                        System.out.println("Thread 2 exited");
                    }
                }
            }
        };

        t1.start();
        t2.start();

        //Deadlock can be avoided by avoiding using nested synchronized blocks and decreasing the number of unnecessary locks
        //By Giving resource1 first and then the resource2 deadlock can be avoided
    }
}*/