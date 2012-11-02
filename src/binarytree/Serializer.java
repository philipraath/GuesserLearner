package binarytree;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Serializer {
	
	/**
	 * Serializes an object to a file named with the filename.
	 * @param filename - String, the filename to save to
	 * @param object - Object, any subclass of Object
	 * @throws IOException
	 */
	public void serializeToFile( String filename, Object object )
	{
		try
		{
			OutputStream file = new FileOutputStream( filename );
			BufferedOutputStream buffer = new BufferedOutputStream( file );
			ObjectOutput output = new ObjectOutputStream( buffer );
			try
			{
				output.writeObject( object );
			}
			finally
			{
				output.close();
			}
		}
		catch( IOException e)
		{
			System.err.println( e.getMessage() );
		}
	}
	
	/**
	 * Returns the deserialization of a file containing a serialized object.
	 * @param filename - String, the filename to save to
	 * @return Object - whatever object is stored in the file
	 * @throws IOException - file not found
	 */
	public Object deserializeFromFile( String filename )
	{
		Object recovered = null;
		try
		{
			InputStream file = new FileInputStream( filename );
			BufferedInputStream buffer = new BufferedInputStream( file );
			ObjectInput input = new ObjectInputStream( buffer );
			try
			{
				recovered = input.readObject();
			}
			finally
			{
				input.close();
			}
		}
		catch( ClassNotFoundException e )
		{
			System.err.println( e.getMessage() );
		}
		catch( IOException e )
		{
			System.err.println( e.getMessage() );
		}
		return recovered;
	}
}
