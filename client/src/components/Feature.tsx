export default function Feature({ imgSrc = 'https://picsum.photos/1400/900', imgAlt = '' }: ImageProps = {}) {

    return (
        <>
            <img className='featureImg' src={imgSrc ?? ''} alt={imgAlt ?? ''} />
        </>
    )
}

interface ImageProps {
    imgSrc?: string;
    imgAlt?: string;
}