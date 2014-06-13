package psmod.attr;

public class Attribute {
 private String rawData;
 private DataType type;

 public void setRawData(String rawData) {
  this.rawData = rawData;
 }
 public String getRawData() {
  return rawData;
 }

 public void setType(DataType type) {
  this.type = type;
 }
 public DataType getType() {
  return type;
 }
}

enum DataType {
 INTEGER(Integer.class),
 STRING(String.class),
 BOOLEAN(Boolean.class);

 private Class clazz;

 private DataType(Class a) {
  clazz = a;
 }
 public Class getRealClass() {
  return clazz;
 }
}
