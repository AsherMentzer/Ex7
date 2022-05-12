package fileSystem;
import java.util.ArrayList;
import java.util.List;


public class DirectoryDetails extends FileDetails {
    List<FileDetails> filesDetails;
    public DirectoryDetails(String path, String name){
        super(path,name);
        filesDetails=new ArrayList<>();
    }

    @Override
    public void accept(FileDetailsVisitor fileDetailsVisitor) {
        for(FileDetails file:filesDetails) {
           file.accept(fileDetailsVisitor);
        }
        fileDetailsVisitor.visit(this);
    }

    public void addFile(FileDetails fileDetails){
        filesDetails.add(fileDetails);
    }
}