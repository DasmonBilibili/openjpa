/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package org.apache.openjpa.persistence.criteria;

import javax.persistence.metamodel.Attribute;
import javax.persistence.metamodel.Map;

@javax.persistence.metamodel.TypesafeMetamodel(
    value=org.apache.openjpa.persistence.criteria.Student.class)
public class Student_ {
    public static volatile Map<Student,Course,Semester> enrollment;
    public static volatile Attribute<Student,Integer> id;
    public static volatile Attribute<Student,String> name;
}
