package cn.edu.nju.sa2017.pipefilter;

import org.springframework.batch.item.ItemWriter;
import java.io.*;
import java.io.FileWriter;
import java.util.List;

public class Writer_txt implements ItemWriter<Report> {
    @Override
    public void write(List<? extends Report> list)  throws Exception {
        File file = new File("txt/outputs/report.txt");
        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter(file);
            for(int i = 0; i < list.size(); i++){
                Report context=list.get(i);
                fileWriter.write(context.toFile()+"\r\n");
                fileWriter.flush();
            }
        }catch(Exception e){
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
*/