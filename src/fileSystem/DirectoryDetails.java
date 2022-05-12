package fileSystem;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// TODO: Implement Composite (change this file).
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