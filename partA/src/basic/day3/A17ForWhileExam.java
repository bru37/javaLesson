package basic.day3;

import basic.day2.Stirng;

public class A17ForWhileExam {
    
    public static void main(String[] args) {
    //반복문 for가 활용되는 예시

    String message = "Hello, World~ Hoi";

    for(int i=0; i<message.length();i++) {
        char temp=message.charAt(i);
        System.out.println("i="+i+"글자="+temp);
    }   

    int k = 0;
    while (k<message.length()) {
       
       char temp2= message.charAt(k);
        System.out.println("k="+k+"글자="+temp2);
        k++;
<<<<<<< HEAD
        System.out.println("");
    }


    int count=0;
        // // 위의 for문을 while문으로 바꿔서 출력
    
  for(int i=0; i<message.length();i++) {
        char temp=message.charAt(i);
   if (temp=='o') {
        count++;
   } 
  }     System.out.println("소문자 o의 개수는"+count);


            }
=======
    }  
    int count=0;
>>>>>>> f5bdf0e60c0b9dcea637fb618898f0605d070089

    for(int i=0; i<message.length();i++) {
        char temp=message.charAt(i);
    if (temp=='o') {
        count++;
    }       
        }
        System.out.println("o의개수는"+count);
        
        }
  

    }// main
// class