import java.io.*;
import java.util.Comparator;

public class Scanner {
    public Scanner(InputStream in) {
    }

    public static  void scannerDirectory(TreeNode node){
        File[] file = node.file.listFiles();
        if(file ==null){
            return;
        }
        for(File files:file){
            TreeNode child = new TreeNode();
            child.file = files;
            if(files.isDirectory()){
                scannerDirectory(child);
            }else{
                child.totalLength = file.length;
            }
            node.totalLength += child.totalLength;
            node.children.add(child);
        }
    }

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        TreeNode root = new TreeNode();
        root.file = new File("C:\\");
        scannerDirectory(root);
        PrintStream out  = new PrintStream(new FileOutputStream("C啊C.txt"),true,"UTF-8");
//        Comparator<TreeNode > sotrByLengthDesc = new Comparator<TreeNode>() {
//            @Override
//            public int compare(TreeNode o1, TreeNode o2) {
//                if(o1.)
//            }
//        }

    }
}
