/**
 * 
 */
/**
 * 
 */
module databaseObjetos {
	requires db4o;

	opens practica18 to db4o;
	opens practica18.models to db4o;
	opens practica18.controllers to db4o;
	opens practica18.exceptions to db4o;
}