import { useState } from 'react';
import Header from './components/Header';
import Intro from './components/Intro';
import Form from './components/Forms';

export default function Page() {

	const showLogin = true;
	
	let landing = (
		<>
			<Header />
			<Intro headerText='Find Your Perfect Place to Stay' descText='Conveniently aggregate interoperable value after cross functional innovation. Enthusiastically transition innovative web services before future-proof.' />
			<Form type='booking' />
		</>
	)

	return (
		<>
			{showLogin && <Form type='login' />}
		</>
	)
}