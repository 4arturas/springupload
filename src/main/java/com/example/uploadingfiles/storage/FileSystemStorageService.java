package com.example.uploadingfiles.storage;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileSystemStorageService {


	public void store(MultipartFile file) {
		if (file.isEmpty()) {
			throw new IllegalArgumentException("Failed to store empty file.");
		}
		final String name = file.getName();
		System.out.println(file.getName());
	}
}
