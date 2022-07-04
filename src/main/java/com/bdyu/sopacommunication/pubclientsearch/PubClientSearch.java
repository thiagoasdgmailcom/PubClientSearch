/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.bdyu.sopacommunication.pubclientsearch;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thiago.diniz
 */
public class PubClientSearch {

    public static void main(String[] args) {
        
        
        try { // Call Web Service Operation
            com.bdyu.sopacommunication.publicationsws.PubWS_Service service = new com.bdyu.sopacommunication.publicationsws.PubWS_Service();
            com.bdyu.sopacommunication.publicationsws.PubWS port = service.getPubWSPort();
            // TODO initialize WS operation arguments here
            java.lang.String sTitle = "process";
            // TODO process result here
            int result = port.getPublicationsCountFromTitle(sTitle);
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        
        try { // Call Web Service Operation
            
            com.bdyu.sopacommunication.publicationsws.PubWS_Service service = new com.bdyu.sopacommunication.publicationsws.PubWS_Service();
            com.bdyu.sopacommunication.publicationsws.PubWS port = service.getPubWSPort();
            // TODO initialize WS operation arguments here
            java.lang.String sTitle = "a";
        
            List<com.bdyu.sopacommunication.publicationsws.Publication> tPublicationList;
        
            tPublicationList = new ArrayList<com.bdyu.sopacommunication.publicationsws.Publication>();
            
            int tCount = port.getPublicationsCountFromTitle(sTitle);
            
            com.bdyu.sopacommunication.publicationsws.Publication[] tPubs = new com.bdyu.sopacommunication.publicationsws.Publication[tCount];
               
            tPublicationList = port.getPublicationsFromTitle(sTitle);
                    
            String tResultString = "";

            for(int tIX = 0; tIX < tPublicationList.size(); tIX++) {
                
                com.bdyu.sopacommunication.publicationsws.Publication tPublication = tPublicationList.get(tIX);
                
                String tTitle = tPublication.getTitle();
                
                List<com.bdyu.sopacommunication.publicationsws.Author> tAuthorList;
                
                tAuthorList = new ArrayList<com.bdyu.sopacommunication.publicationsws.Author>();
                   
                tAuthorList = tPublication.getPAuthorList();
                //com.bdyu.sopacommunication.publicationsws.Author[] tAuthors = new com.bdyu.sopacommunication.publicationsws.Author[tPublication.getAuthorsCount()];
                
               // tAuthors = tPublication.getAuthors();

                tResultString = tResultString + "\n";

                tResultString = tResultString + "" + tTitle + "";
                tResultString = tResultString + "" + "(" + String.valueOf(tPublication.getPublishYear()) + ")";
                tResultString = tResultString + ", pp. " + String.valueOf(tPublication.getPageStart()) + "-" + String.valueOf(tPublication.getPageEnd()) + ".";

                for(int tIXAut = 0; tIXAut < tAuthorList.size(); tIXAut++) {
                    com.bdyu.sopacommunication.publicationsws.Author tAuthor = tAuthorList.get(tIXAut);
                    tResultString = tResultString + "\n\t";
                    tResultString = tResultString + tAuthor.getName() + ";";
                }

                tResultString = tResultString + "\n";

            }
            
            System.out.println(tResultString);
            
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

        
        System.out.println("Hello World!");
    }
}
