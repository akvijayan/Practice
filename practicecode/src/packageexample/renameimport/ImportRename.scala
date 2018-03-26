package packageexample.renameimport

// we can create an alias of "import java.util.ArrayList" as:
import java.util.{ArrayList => JavaList}

class ImportRename {

  //Now we can use the alias instead of val list = new ArrayList()
  val list = new JavaList()
}
