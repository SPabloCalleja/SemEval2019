/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.upm.oeg.semeval2019;

import java.io.File;
import org.upm.oeg.semeval2019.gate.GateCorpus;
import org.upm.oeg.semeval2019.gate.GateHandler;
/**
 *
 * @author Pablo
 */
public class GoldStandardLoader {
    
   
    public static void main(String[] args) throws Exception {

       GateHandler.initGate("resources", true, "ANNIE", "Tools"); //
       
       GateCorpus corpus= new GateCorpus();
       String dir= "C:\\Users\\Pablo\\Documents\\NetBeansProjects\\SemEval2019\\resources\\devdata\\detectiontext";
       corpus.createCorpusfromFolder(dir, "Semeval", "UTF-8");
         
        
       
       corpus.loadGoldStandardFromFile(
               new File("C:\\Users\\Pablo\\Documents\\NetBeansProjects\\SemEval2019\\resources\\devdata\\detectionannotation\\LocationGold.txt"),
               "Location", "Evaluation");
         
        
        
    }
     
      
}
