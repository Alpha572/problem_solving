// problem:  convert string into int;
/*
الشرح:
بص لو عايز الحل السهل ف ده هو الحل

static int converting(String s){
  return s.isEmpty()? 0:Integer.parseInt(s); 
    }
  
    public static void main(String[] args) {
        String s="-700";
        System.out.println(converting(s)+converting(""));
        System.out.println(converting(s)+converting("10"));
        System.out.println(converting(s)+converting("-100"));
    }
}

استخدمنا method جاهزه 
=======================================================================
:)انما لو عايز تطور نفسك ف خليك ف الحل ده و انا مش بخيرك انت هتبص علي الحل الصعب 

بص يا معلم، الكود ده شغال على تحويل string اللي فيه أرقام إلى عدد صحيح، يعني بيحول "123" إلى 123 مثلًا، أو "-456" إلى -456، وكل ده من غير ما يستخدم Integer.parseInt() الجاهز.

نشرحها بالراحة
إحنا عندنا دالة اسمها string_into_int بتاخد String s كمدخل وبتطلع رقم صحيح (int).

أول حاجة، بنعرف متغير result ونخليه بـ 0، ده اللي هنخزن فيه الرقم النهائي بعد التحويل.

بنعمل تشيك سريع لو الـ String فاضي ("")، بنحطه ب 0 وخلاص، يعني لو مفيش حاجة نحولها، مفيش داعي نتعب نفسنا.

نيجي بقى للحتة التقيلة، عندنا لوب (for loop) ماشية على كل حرف في الـ String:

s.charAt(i) بيجيب الحرف عند كل إندكس.
digits(s.charAt(i)) دي المفروض تكون دالة بتحول الحرف ده لرقم (مثلا '3' يبقى 3).

Math.pow(10, s.length()-1-i) دي بقى السر، هي اللي بتحط الرقم في مكانه الصح.

يعني لو عندك "123"، أول رقم هو '1' في المكان الأكبر، فلازم نضربه في 100، والتاني '2' في 10، والتالت '3' في 1، فهتطلع 100 + 20 + 3 = 123.

  لما تشيل التعليق و تشغل هتفهمها اكتر // System.out.println(s.length()-1-i);و عشان تفهمها اكر انا حاطتلك  

عارف سؤالك اننا لو حطينا سالب  كده طول الجمله هيبقي اكبر بواحد و ده هياثر علي النتيجه؟ 

فعشان كده السالب  هتبقي قيمتها صفر و هنرجع ل ابتدائي و نقول اي رقم في صفر ب كام؟؟ معلم ب صفر صح و كده المشكله اتحلتdefault ->0 عندنا ال digits احب افكرك اننا هنا في

900 -> 9*100 + 0*10 + 0*1 =900
-900 -> (0*1000 + 9*100 + 0*10 + 0*1)*-1=-900 

بعد ما نخلص اللفة، عندنا تشيك أخير:

لو الرقم بدأ بـ '-'، نضربه في -1 عشان نخليه سالب، وبعدين نرجع ال result.
لو مش سالب، بنرجع ال result على طول.
تخيل الكود ده كأنه واحد بيكتب رقم بالإيد:
بيعد الحروف واحد واحد، ويشوف قيمته كام، وبعد كده بيحطه في مكانه الصح حسب خانته.
في الآخر، لو الرقم بدأ بسالب، بيخبطه على وشه بمضروب -1     عشان يقلبه سالب.
وأهو، طلعلك الرقم اللي كنت بتدور عليه، كله بالكود ده من غير دوال جاهزة!


و حمدلله علي السلامه يا بطل 



*/

public class convert_string_into_int {
    
    static int digits(char d){
  return switch(d){
        case '0'-> 0; 
        case '1'-> 1;
        case '2'-> 2;
        case '3'-> 3;
        case '4'-> 4;
        case '5'-> 5;
        case '6'-> 6;
        case '7'-> 7;
        case '8'-> 8;
        case '9'-> 9;    
        default -> 0;    
    };
  } 
    
    
static int string_into_int(String s){
  int result=0;
    if(s.isEmpty())return result;
  for(int i=0;i<s.length();i++){
result+=digits(s.charAt(i))*Math.pow(10, s.length()-1-i);
      // System.out.println(s.length()-1-i);
    }
if(s.charAt(0)=='-') return result * -1;

  return result;
    }
    

    

    public static void main(String[] args) {
        
        String s="900";
        String n="";
        System.out.println(string_into_int(s)+string_into_int(n));
        System.out.println("====");
        System.out.println(string_into_int(s)+string_into_int("-100"));        
    }
    
}
