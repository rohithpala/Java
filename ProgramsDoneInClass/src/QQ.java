class QQ {
  int n;
  boolean semaphore = false;

  synchronized int get() {
    if(!semaphore)
      try {
        wait();

     } catch(InterruptedException e) {
        System.out.println("InterruptedException caught");
      }
    //I'll execute only when some parallel thread notifies me
      System.out.println("Got: " + n);
      semaphore = false;
      notifyAll();
      return n;
  }

  synchronized void put(int n) {
    if(semaphore)
      try {
        wait();
      } catch(InterruptedException e) {
        System.out.println("InterruptedException caught");
      }
    	//I'll execute only when some parallel thread notifies me
      this.n = n;
      semaphore = true;
      System.out.println("Put: " + n);
      notifyAll();
  }
}
