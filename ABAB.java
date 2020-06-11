package lesson4;

public class ABAB {
    Object obj = new Object();
    public volatile char Letter = 'A';


    public static void main(String[] args) {
        ABAB e1 = new ABAB();
        for (int i = 0; i < 5 ; i++) {

            new Thread(() -> e1.method1()).start();
            new Thread(() -> e1.method2()).start();
            new Thread(() -> e1.method3()).start();
        }
    }

    public  void method1() {
        synchronized (obj) {
            for (int i = 0; i < 1; i++) {
                     while (Letter != 'A') {
                         try {
                             obj.wait();
                         } catch (InterruptedException e) {
                             e.printStackTrace();
                         }
                     }
                System.out.print("A" + " ");
                     Letter = 'B';
                obj.notify();
                }
            }
            }



      public  void  method2 () {
          synchronized (obj) {
              for (int i = 0; i < 1; i++) {
                  while (Letter != 'B') {
                      try {
                          obj.wait();
                      } catch (InterruptedException e) {
                          e.printStackTrace();
                      }
                  }
                  System.out.print("B"  + " " );
                  Letter = 'C';
                  obj.notify();
              }

              }
          }

      public void method3() {
        synchronized (obj) {
            for (int i = 0; i < 1 ; i++) {
                while (Letter != 'C') {
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("C" + " ");
                Letter = 'A';
                obj.notify();
            }

            }
        }

    }


