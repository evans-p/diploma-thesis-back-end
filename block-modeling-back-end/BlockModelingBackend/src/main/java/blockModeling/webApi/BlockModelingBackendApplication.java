package blockModeling.webApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import blockModeling.fileUploading.FileStorageProperties; 

@SpringBootApplication
@EnableConfigurationProperties({FileStorageProperties.class})
public class BlockModelingBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlockModelingBackendApplication.class, args);
	}
}
