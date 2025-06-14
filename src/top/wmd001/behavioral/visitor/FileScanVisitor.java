package top.wmd001.behavioral.visitor;

import java.io.File;

public class FileScanVisitor implements Visitor{
    @Override
    public void visit(FileElement fileElement) {
        String path = fileElement.getPath();
        File file = new File(path);
        if (file.isFile()) {
            System.out.println(file.getName());
        } else if (file.isDirectory()) {
            File[] files = file.listFiles();
            assert files != null;
            for (File f : files) {
                visit(new FileElement(f.getAbsolutePath()));
            }
        }
    }

}
