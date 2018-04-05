### DICL Internship Program 2018

สวัสดีน้องๆที่ให้ความสนใจมาฝึกงานที่บริษัท ดิจิตอล อินไซด์เดอร์ จำกัด ในปี 2018 นี้ทุกๆคนนะครับ ก่อนที่จะเข้ามาฝึกงานกับเรา พี่มีบททดสอบเล็กน้อยเพื่อวัดทักษะพื้นฐานสำหรับนักพัฒนา Mobile Developer น้องๆไม่จำเป็นต้องตอบหรือต้องรู้ทุกเรื่องในบททดสอบนี้ เพราะเรามาสามารถมาเรียนรู้กันภายหลังได้ เพียงแต่เราอยากให้น้องๆทุกคนลองทำด้วยตัวเอง ค้นคว้าเอง ทั้งหมดก็เพื่อประโยชน์ของตัวน้องๆเองและบริษัท หากใครสนใจส่งคำตอบกันมานะได้เลยนะครับ ปิดรับสมัครวันที่ 8 เมษายน 18 เวลา 23:59 น.

## 1. Code in Swift or Java / Kotlin
แบบทดสอบนี้จะดูทักษะความรู้ความเข้าใจเกี่ยวกับเรื่อง Collection เช่น Array, Dictionary เป็นต้น

ดาวน์โหลดข้อมูล [data.json](https://github.com/memogames/dicl-intern-18/blob/master/data.json) และเขียนโค้ดเพื่อหาคำตอบ
- 1.1 หาคะแนนเฉลี่ย **score** ของนักเรียน
- 1.2 แสดงชื่อและเกรดของนักเรียนที่ได้คะแนนมากว่า 70 ขึ้นไป
- 1.3 ค้นหาชื่อนักเรียนที่มีคะแนนมากที่สุดและต่ำที่สุด **score**

คำตอบ:
```
import java.io.FileNotFoundException;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class scores {
    public static void main(String args[]){ 
    	JSONParser parser = new JSONParser();
        try {
            JSONArray arr = (JSONArray) parser.parse(new FileReader("C:\\Users\\Admin\\dicl-intern-18\\data.json"));           
            long total=0,max=-999,min=999;
            
            for (Object o : arr) {
                JSONObject student = (JSONObject) o;
                long Score = (long) student.get("score");
                total+=Score;
            }
            System.out.println("1.1:Average=" + (total/6)); 
            
            System.out.println("\n1.2:"); 
            for (Object o : arr) {
                JSONObject student = (JSONObject) o;
                String Name = (String) student.get("name");
                long Score = (long) student.get("score");                
                //1.2
                if(Score>70) {
                	System.out.println("Name:" + Name + "\tScore:"+Score);
                }               
                //1.3
                if(Score>max) {
                	max=Score;        	
                }if(Score<min) {
                	min=Score;
                }                             
            }
            System.out.println("\n1.3: "); 
            System.out.println("Max:" +max);  
            System.out.println("Min:" +min);  
            
        }
        catch(FileNotFoundException fe){
            fe.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
```

## 2. Create Simple Mobile Application

แบบทดสอบนี้จะดูทักษะความรู้ความเข้าใจสำหรับการพัฒนาแอปพลิเคชั่น และการใช้ UI พื้นฐานของแต่ละ Platform

### Features
- GET ข้อมูล JSON จาก [movie.json](https://github.com/memogames/dicl-intern-18/blob/master/movie.json)
- แสดงรายชื่อและรูปภาพใน ListView หรือ TableView
- ผู้ใช้สามารถกดเพื่อดูข้อมูลรายละเอียดได้ในหน้าถัดไป
- ผู้ใช้สามารถแชร์ข้อมูลชื่อหนังที่สนใจให้กับเพื่อนๆได้
- ออกแบบ UI ได้ตามความต้องการ
- ใช้ Library เพิิ่มเติิมได้

### Technical
- ดาวน์โหลดข้อมูล JSON
- เครื่องมือที่ใช้ Android Studio หรือ Xcode.

## 3. Tiny Question

Q1: Firebase คืออะไร มีฟังก์ชั่นที่น้องๆชื่นชอบอะไรบ้างและเพราะอะไร (อย่างน้อย 3 ฟังก์ชั่น)

```
Firebase คือ Project ที่ถูกออกแบบมาให้เป็น API และ Cloud Storage สำหรับพัฒนา Realtime Application 
ยังไม่ได้ใช้ Firebase เท่าที่ควรจึงยังไม่รู้ฟังก์ชั่นต่างๆมาก
```

Q2: REST API คืออะไร

```
REST API เป็นวิธีในการสร้าง Web Service รูปแบบนึงที่อาศัย HTTP Method ในการทำงาน และส่งผลกลับมาในรูปแบบของ JSON หรือ XML ส่งผลให้สามารถรับส่งข้อมูลไปมาข้าม Platform ได้อย่างสะดวก
```

Q3: หากต้องสร้างแอปพลิเคชั่น 1 ตัว เพื่อให้รองรับทั้งระบบ iOS และ Android วิิธีไหนที่น้องๆอยากเลือกใช้พัฒนาระหว่าง Native App กับ Cross Platform และเพราะอะไร 

```
วิิธีที่อยากเลือกใช้พัฒนาคือ Native App เพราะหากเราแยกการพัฒนากัน แอปพลิเคชั่นที่เราพัฒนานั้นจะได้ศักยภาพมากกว่า เช่น เราสามารถใช้ Functions ทุกอย่างของ Platform นั้นได้อย่างเต็มประสิทธิภาพเนื่องจากไม่กระทบต่อ Platform อื่นๆ เพราะเราเลือกพัฒนาแบบ Native App หากเราพัฒนาแบบ Cross Platform บาง Functions ไม่สามารถใช้ได้หรือไม่รองรับกับ Platform ตรงข้าม เป็นต้น 
```

Q4: ถ้าให้เลือกได้ 1 บ้าน น้องๆอยากอยู่บ้านไหนระหว่าง Apple , Google และ Microsoft

```
Google
```

Q5: เวลาว่างสิ่งที่ชอบทำที่สุดคืออะไร 2 อันดับแรก

```
ดูหนัง,เล่นเกม
```

Q6: แอปพลิเคชั่นไหนบนมือถือที่ชอบที่สุดและเกียจที่สุดตั้งแต่เคยใช้งานมา (ไม่รวมเกมส์) เพราะอะไร

```
- แอปพลิเคชั่นที่ชอบที่สุดคือ Youtube เพราะเป็นศูนย์รวมวิดีโอต่างๆเอาไว้ค้นหาเพื่อดูและฟังแก้เคลียด
- แอปพลิเคชั่นที่เกลียดที่สุดคือ KTB netbank เนื่องจาก KTB netbank ในขณะที่เราใส่ข้อมูลผิดพลาดหรือเลือกเมนูผิดเราไม่สามารถกดปุ่มย้อนกลับบนโทรศัพท์ได้ หากเรากดระบบจะถามว่าจะออกจากแอปพลิเคชั่นหรือไม่ ระบบจะไม่ทำการย้อนกลับไปหน้าก่อนหน้าที่เราได้ใช้่ผ่านมา
```

Q7: อะไรบ้างที่น้องๆคาดว่าจะได้รับในขณะที่ฝึกงานกับพวกเรา?

```
1.เทคนิคและความรู้ต่างๆทั้งที่เคยรู้มาก่อนและไม่เคยรู้มาก่อน 
2.ความยากและการควบคุม กำหนดเวลาในการทำงานในสถานการณ์จริง 
3.ความสามัคคีและการสื่อสารระหว่างทีมในการทำงานต่างๆ
```

## Submitting

ให้น้องๆ fork repo นี้แล้วตอบคำถาม จากนั้นส่ง repo มาที่ อีเมลล์ memo.games@gmail.com
