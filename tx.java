package com.shai.my;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.Context;
import android.content.SharedPreferences;
import android.app.AlertDialog;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class tx extends Activity {

    private TextView countLabel;
    private TextView questionLabel;
    private Button ansButton1;
    private Button ansButton2;
    private Button ansButton3;
    private Button ansButton4;
    private String rightAnswer;
    private int rightAnswerCount=0;
    private int quizCount=1;
    private final int QUIZ_COUNT=5;
    ArrayList<ArrayList<String>> quizArray =new ArrayList<>();
    String quizData [][]={
            //{"Country","RightAnswer","Choice1","Choice2","Choice3};
 {"1. All of the followings are true about genetics except:",
"Deals with unrelated organisms",
"Deals with Hereditary Informations","Deals with Hereditary diseases",
"Deals with Hereditary mechanisms"},{"2. All of the followings are expressed traits except",
"Traits express genes",
"Talents",
"Height", 
"Hair color"},
{"4. All of the followings are true about genes except:",
" Bigger than chromosomes",".Express traits",
"They are Segments of DNA",
"They are parts of chromosomes"},
{"5. All of the followings are true except:",
"Traits are passed from offspring to parents",
"Traits are determined by genes",
"Chromosomes are found as pairs",
"Genes mostly come in pairs",},
{"6. All of the followings are true except:",
"Human has 48 chromosomes", 
"Human has 23 pairs of chromosomes",
"Sperm has 23 chromosomes",
"Ovum has 23 chromosomes"},
{"7. All of the followings are true except:","Homologous chromosomes carry different genes","Genetic Information is carried in 23 pairs of chromosomes",
"Genetic Information is carried in 46 chromosomes"," Half of genes come from mother"},
{"8. All of the followings are true except:"," Human has 46 homologous chromosomes","Human has 22 homologous chromosomes in males plus XY sex chromosomes","Y chromosomes from father","X chromosomes from mother"},
{"9. All of the followings are true except:","Sex chromosomes are autosomes","XX chromosomes are sex chromosomes","XY chromosomes are sex chromosomes","Chromosomes other than XX and XY are called autosomes"},
{"10. All of the followings are true except:"," Loci are found on genes ","Loci has gene"," Genes carry traits "," Complexion is Trait"},
{"11. All of the followings are true about Genes except:","All are false","Basic unit of Hereditary","Very long strand of Deoxyribonucleic acid","Located on its place on chromosomes called locus"},

{"12.  All of the followings are true except:", "Allele is single possibility of gene for eye color","Eye color is trait"
,"Eye color can be blue in Whites and Brown in Colored","Dominant gene will be able to Express its eye color"},{"13  All of the followings are true except:","All are false", "Blood group has 3 alleles  A B O","Human can inherit only 2 alleles of blood group","Human blood group is a single trait coded by multiple alleles"},

{"14. All of the followings are true except:",
"Phenotype is strictly inherited",
"Morphology i.e the look is Phenotype",
"Phenotype does not depend on genes exclusively ",
"Behaviour is phenotype"},
{"15. All of the followings are true about Genotype except:",
"All are false",
"Completely dependent on genes sequence ",
"Inherited by the offspring ",
"Genotype is strictly inherited"},
{"16. All of the followings are true except:",
"Phenotype is strictly inherited not affected by environment",
"Phenotype is determined by outward characteristics ",
"Genotype is strictly inherited ",
"Genotype can be determined by DNA testing"},
{ "17. All of the followings are true except:",
"P is the offspring generation",
"Yy are heterozygous",
"YY are homozygous",
"D for dominant trait, while d will be for the recessive one"},
{ "18. All of the followings are true regarding Mendel choice for pea for his experiments except:",
"Pea is expensive",
"Short generation times give chance to observing more offspring", 
"Pea Has many Phenotypes shapes and colors ",
"Pea has a lot of offspring giving good chance to observing different shapes"},
{"19. All of the followings are true except:",
"Mendel studied the genotypes by advanced technology",
"Mendel did not know about the genotype at that time ",
"Mendel knew the Phenotypes only ",
"Mendel crossed two different true Phenotypes"},
{"20. all of the followings are Mendel's Laws except:",
"All are false",
"Recessive allele do not show in the Phenotype if dominant allele is present",
"Recessive allele is found in the genotype but not necessarily in the Phenotype",
"Dominate allele shows the Phenotype"},
{"21. All of the followings are true except:",
"In Homozygous if father gene for blood group is A, mother gene for blood group will be O ",
"In Heterozygous gene from father differ from gene from the mother for hair or eye color as examples ",
"Homozygous has identical genes from father and mother",
"In Homozygous if father gene for blood group is A, mother gene for blood group will also be A."},
{ "22. All of the followings are true about Mendel's Law of Segregation except:",
"Ovum has 2 alleles for a trait",
"Sperm has 1 allele for a trait",
"Zygote has 2 alleles for a trait ",
"Gametes are the sperm and ovum and are formed by meiosis"},
{"23. All of the followings are true except:",
"Genes pairs are separated during mitosis not meiosis ",
"Eye color is inherited independently from hair color ",
"Cross-over selects genes randomly, so brothers can have different skin colors",
"Genes are inherited independently from each other"},
{"24. All of the followings are true except:",
"All Europeans must have white skin and blue eyes", 
"Each gamete carrys one allele for each inherited character", 
"Gametes unite to form Zygote which carries 2 alleles for each inherited  character", 
"Dominant gene shows the  Phenotype"}, 


              
 {"25.  All of the followings are true about Down's syndrome except:",
"Caused by non-disjunction of 22nd chromosome",
"They have trisomy of 21st chromosome ",
"It is a Meiosis error", 
"Have slanted eyes"},{
"25. All of the followings are true about Sickle cell anemia except:",
"Is dominant gene Mutation",
"Cells sickled instead of rounded",
"Red cells cannot carry  enough O2",
"Found mostly in Afroamerican"},
{"27.  All of the followings are true about Cystic a Fibrosis except:", 
"Due to  Translocation not Deletion",
"Monogenic",
"Affects respiratory system"
,"Common in Whites"},
{"26. All are true except:",
"Diabetes is not affected by genes",
"Albinism is Autosomal Recessive ",
"Sex-Linked diseases are located on the X",
"Sex-Linked diseases show only in males"},
{"28.  All are true except:","Haemophilia is not Sex-Linked ",
"Color Blindness is Sex-Linked ",
"Haemophilia patient can bleed to death",
"Haemophilia disorder is on X chromosome"},
               
   {"Samples for DNA testing are collected from all of the followings except:"
,"Tooth without root"
,"Saliva"
,"Hair"
,"Nail"},
{"All of the followings are true regarding DNA sample Collection:"
,"Talking does not contaminate sample"
,"Avoid touching "
,"Avoid moisture "
,"You need gloves"},
{"All of the followings are true about PCR except:"
,"Can not analyze small samples"
,"Make multiple copies of DNA" 
,"Can analyze even very few cells"
,"Can be contaminated"},
{"All of the followings are true about Mitochondrial DNA analysis except:"
,"All are false "
,"Uses extracts of Mitochondria rather than DNA"
,"Useful in old cases"
,"Useful in old samples"},
{"All of the followings are Sources of contamination of DNA sample except:",
"Handling with gloves"
,"Coughing and sneezing over sample"
,"Wind"
,"Touching sample"}

            
               
               
                 };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        countLabel = (TextView)findViewById(R.id.countLabel);
        questionLabel = (TextView)findViewById(R.id.questionLabel);
        ansButton1 = (Button)findViewById(R.id.ansButton1);
        ansButton2 = (Button)findViewById(R.id.ansButton2);
        ansButton3 = (Button)findViewById(R.id.ansButton3);
        ansButton4 = (Button)findViewById(R.id.ansButton4);
//////////     
//////////
        //Create Quiz Array from Quiz Data
        for (int i=0;i<quizData.length;i++){
            ArrayList<String> tmpArray=new ArrayList<>();
            tmpArray.add(quizData[i][0]);
            tmpArray.add(quizData[i][1]);
            tmpArray.add(quizData[i][2]);
            tmpArray.add(quizData[i][3]);
            tmpArray.add(quizData[i][4]);

            // add tmpArray to QuiArray
            quizArray.add(tmpArray);
        }
        showNextQuiz();
     }
     public  void showNextQuiz(){
         countLabel.setText("Question" + quizCount);
         //Generating a random number between 0 and quizArray's length -1
         Random random =new Random();
         int randomNum=random.nextInt(quizArray.size());
         ArrayList<String> Quiz = quizArray.get(randomNum);
         questionLabel.setText("Code:MG"+ Quiz.get(0)  +"? ");
         rightAnswer=Quiz.get(1);
         Quiz.remove(0);
         Collections.shuffle(Quiz);
         ansButton1.setText(Quiz.get(0));
         ansButton2.setText(Quiz.get(1));
         ansButton3.setText(Quiz.get(2));
         ansButton4.setText(Quiz.get(3));

         quizArray.remove(randomNum);
     }

     public void checkAnswer(View view){
         Button ansButton=(Button) findViewById(view.getId());
         String btntxt= ansButton.getText().toString();
         String alertTitle;
         if(btntxt.equals(rightAnswer)){
             alertTitle="Correct!";
             rightAnswerCount++;
         }
         else{
             alertTitle="Incorrect";
         }
         AlertDialog.Builder builder=new AlertDialog.Builder(this);
         builder.setTitle(alertTitle);
         builder.setMessage("Answer: " + rightAnswer);
         builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
             @Override
             public void onClick(DialogInterface dialogInterface, int i) {
                      if (quizCount == QUIZ_COUNT){
                          //show result
                          Intent intent=new Intent(getApplicationContext(),ty.class);
  
///////id//////

SharedPreferences settings2 = getSharedPreferences("Quizapp", Context.MODE_PRIVATE);
String myPassword=getIntent().getStringExtra("RIGHT_ANSWER_COUN");
 intent.putExtra("RIGHT_ANSWER_COUN",myPassword); 
  
  //////end////  
  
  ////name/////

SharedPreferences settings3 = getSharedPreferences("Quizapp", Context.MODE_PRIVATE);
String nname=getIntent().getStringExtra("RIGHT_ANSWER_COU");
 intent.putExtra("RIGHT_ANSWER_COU",nname); 
  
  //////////  
                             intent.putExtra("RIGHT_ANSWER_COUNT",rightAnswerCount);
  
                          startActivity(intent);
                      }
                      else {
               quizCount++;
                          showNextQuiz();
                      }

             }
         });
         builder.setCancelable(false);
        builder.show();


     }

}