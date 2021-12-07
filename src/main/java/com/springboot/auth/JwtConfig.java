package com.springboot.auth;

public class JwtConfig {
	public static final String LLAVE_SECRETA = "mi.clave.secreta.12345678";
	
	/*
	public static final String RSA_PRIVADA = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCszY2uHT9Fk2SM\r\n"
			+ "737J2/fshZxHsRWGa86pvXdyqmzOU3OY7EnTBBzsJ3lXKRVoNjjvS/oIwoivoE/K\r\n"
			+ "uB2rD3rnfZ5s99Jq8WF/gDBKiIQqyHgcop7fYFgESyVhJV9kohUTfgbLRcKearA3\r\n"
			+ "V9TutR7QE9x5TLGoir1cwy34lrjYu6gxH+XiNOaz4+E6NDUIIwhpUIFIrYKz3PiT\r\n"
			+ "qHdt1MY2Z6icdDap8lYHSnDgOR3942A1S/HgbDHsqegtSfuHfXqG8kMK8mcbkToL\r\n"
			+ "n23NlWmasgD1dpkYa3v80kUN7P7c1C+Zi8sbVX+pChQO3rncu69vOdaZV1IHOJsz\r\n"
			+ "dlsr4JyZAgMBAAECggEAK8GlFai8Q87t0C446b50igTPLOwvailUXHDolTWIdbp1\r\n"
			+ "9AwpKXDKLhZUyHhTvl60jgusFZnE6MvsSIXUpWM3GPUbL7aVJpVWveVk1Qq6hObc\r\n"
			+ "W0vmdOO9heDNZ0sCW8YbFiN8bu6MOHcFhg4MkiF02vWch26fMfFnv9yAgIkR53c6\r\n"
			+ "iq3HueMIs5Vt+gRtHzx37suV9iUhq6E2O4boVbZwLzMIllaloj7mBfq31TYsTDBH\r\n"
			+ "ztIrDIVj6HzOK7XSmzWw8A8934qz2xd6pTo+WbzCVDV6h6huUnH66DOoxYc1Sduq\r\n"
			+ "6ujRzZQfycla865HyTPDqZS7m0rTNtaguG46zSUarQKBgQDfX9fHqCMjZSPVoRdT\r\n"
			+ "YEMLe8BeELSiQ7oij4aoyJDQi23QNI2gfnvqaC4sPOA7B2852aV7iGMU6Iuoe7HS\r\n"
			+ "wlRyhtDVZBA/6rvV5lvI07JAf03P32X1j8EGFLlayr14Alp5thtY3meHtjDdisqz\r\n"
			+ "q6QuSD3uXabqJgv8vERgFV2jewKBgQDGCs0x3qQmVcxJAOEp+shKYSj0X341mFbD\r\n"
			+ "XqbQsA1ORFNmA4x/S09LiWDy9OvsKqm1yl2LRExtX62IqvIa9o0BzY9vPn/9O/tM\r\n"
			+ "OU4EdyXBScv3/cDyWVFaRneGc4BROv+pKxFY6tD6EDvCqeJzwe/EsukBy1En4YQf\r\n"
			+ "vMTOGVYJ+wKBgDibMTOHiGAP4WThzedzHYprcfRkh2IXh7P6a0WajhhLPSjmKH3j\r\n"
			+ "j8N3YzwSsUBEQguG/Eix52oFBF9N+WJPnNbpE0MAeJ25/p/WIKxj+Wge2rkzA8OX\r\n"
			+ "CnNgDRjVB+7BqevuGkALHHFn2jpKUdP2S0TvScJ+OS5dNex2SV2QDIrBAoGANOHV\r\n"
			+ "gSeOdZ4berL9bRRGP3ZKVVbagL05DdpMeRVJuEiObIMuFR+rAOSiOr4j8WBDCQQM\r\n"
			+ "jo+iSOJvmDrtgz2q0XxufKoXyyslI2l5579ZGY/3IzVjPFOVYaHHcOOOtCIo+qdB\r\n"
			+ "bpjlTKDhFE4A5iA3QjLz/UKpXRjfCwqBEve4/dkCgYBqHP5viHdwgVvdE3binuHd\r\n"
			+ "pF5m+/WrdB05KSJx9Ncw3M0d6VV4oMJja9k9NBtBGPIxLXqPvUzqgj0FfiLYOPOZ\r\n"
			+ "A/odzcUpV/2lb1Baqv8dwrmZBUGZbQ9Q5Pq9rQW/1XhEfFUUTth4RYMVSK+Dz7Ad\r\n"
			+ "WgdO18+kL4YfdYDMfqG59w==\r\n";
	
	public static final String RSA_PUBLICA = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEArM2Nrh0/RZNkjO9+ydv3\r\n"
			+ "7IWcR7EVhmvOqb13cqpszlNzmOxJ0wQc7Cd5VykVaDY470v6CMKIr6BPyrgdqw96\r\n"
			+ "532ebPfSavFhf4AwSoiEKsh4HKKe32BYBEslYSVfZKIVE34Gy0XCnmqwN1fU7rUe\r\n"
			+ "0BPceUyxqIq9XMMt+Ja42LuoMR/l4jTms+PhOjQ1CCMIaVCBSK2Cs9z4k6h3bdTG\r\n"
			+ "NmeonHQ2qfJWB0pw4Dkd/eNgNUvx4Gwx7KnoLUn7h316hvJDCvJnG5E6C59tzZVp\r\n"
			+ "mrIA9XaZGGt7/NJFDez+3NQvmYvLG1V/qQoUDt653LuvbznWmVdSBzibM3ZbK+Cc\r\n"
			+ "mQIDAQAB\r\n";*/

}
