package com.FileReader;

import java.io.IOException;

import com.configuration.ConfigurationClass;

public class FileReaderManager {
	
		
		private FileReaderManager() {
			
		}
		
		public static FileReaderManager getInstanceFR(){
			FileReaderManager reader = new FileReaderManager();
			return reader;
		}
		
		
		public ConfigurationClass getInstanceCR() throws IOException {
			ConfigurationClass config = new ConfigurationClass();
			return config;
		}
		

	}

